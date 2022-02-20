package com.painoTT.worker.service.apiWorkers.stackexChange;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.painoTT.worker.models.RequestQuestion;
import com.painoTT.worker.models.ResponseQuestion;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Map;

@Service
public class StackexChangeApiWorkerImpl implements StackexChangeApiWorker {

    private String baseUri ="https://api.stackexchange.com/2.3";


    /**
     * Поиск вопросов по параметрам
     * @param request запрос с параметрами
     * @return Найденные вопросы
     */
    @Override
    public ResponseQuestion findByParameters(RequestQuestion request) throws Exception {
        String url = baseUri + "/search";
        URI uri = setUriParameters(request, url);
        String response = getResponseQuestion(uri);
        return new ObjectMapper().readValue(response, ResponseQuestion.class);
    }




    /**
     * Получить вопросы по указанному uri
     * @param uri адресс
     * @return Вопросы
     */
    private String getResponseQuestion(URI uri) throws Exception {
        try {
            CloseableHttpClient client = HttpClientBuilder.create()
                    .useSystemProperties().build();
            try (CloseableHttpResponse response = client.execute(new HttpGet(uri))) {
                return EntityUtils.toString(response.getEntity());
            }
        }catch (Exception ex){
            throw new Exception("Ошибка получения объектов со сторонего аpi: " + ex.getMessage());
        }

    }

    /**
     * Изменить базовый uri
     * @param uri новое значение uri
     */
    @Override
    public void changBaseUri(String uri) {
        baseUri = uri;
    }

    /**
     * Установить параметры для запроса
     * @param request запрос с параметрами
     * @return uri с параметрами
     */
    private URI setUriParameters(RequestQuestion request, String uri) throws Exception {
        try {
            Map<String, String> parameters = request.getParameters();
            URIBuilder uriBuilder = new URIBuilder(uri);
            for (var key : parameters.keySet()){
                uriBuilder.addParameter(key, parameters.get(key));
            }
            return uriBuilder.build();
        }catch (Exception ex){
            throw new Exception("Ошибка формирования uri: " + ex.getMessage());
        }

    }
}
