package Dao;

import Factory.Factory;


/**
 * FactoryDao is a interface which defines Factory Data access method
 * It can store/delete or get Factory Data from local system
 *
 * @className: FactoryDao
 * @author: LabmemNo004
 * @description: FactoryDao is a interface which defines Factory Data access method
 * @designPattern: Dao(数据访问对象模式)
 */
interface FactoryDao {

    /**
     * Gets factory Date.
     * @return the factory
     */
    Factory getFactory();

    /**
     * Update factory Date .
     * @param factory the factory
     */
    void updateFactory(Factory factory);
}
