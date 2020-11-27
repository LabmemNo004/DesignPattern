package Dao;

import Factory.Factory;

import java.io.Serializable;


/**
 * FactoryDao is a interface which defines Factory Data access method
 * It can store/delete or get Factory Data from local system
 *
 * @className: FactoryDao
 * @author: LabmemNo004
 * @description: FactoryDao is a interface which defines Factory Data access method
 * @designPattern: Dao(数据访问对象模式)
 */
public interface FactoryDao extends Serializable {

    /**
     * Gets factory Date.
     * @return the factory
     */
    public Factory getFactory();

    /**
     * Update factory Date .
     * @param factory the factory
     */
    public void updateFactory(Factory factory);
}
