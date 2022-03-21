package by.academy.it.task03.dao;

import java.util.Collection;

public interface EstimationDao<T, R> {
    Collection<T> readRequest() throws EstimationDaoException;

    void writeResponse(Collection<R> responses) throws EstimationDaoException;
}
