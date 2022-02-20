package com.painoTT.worker.service.mappers;

/**
 * Маппер объектов
 * @param <D>
 * @param <T>
 */
public interface Mapper<D, T> {
    /**
     * Получить DTO объекта
     * @param type объект
     * @return DTO объекта
     */
    D toDto(T type);
}
