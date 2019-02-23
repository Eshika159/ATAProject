package com.ata.dao;

import java.util.ArrayList;

public interface XyzDao<T> {
String create(T t);
int delete(ArrayList<String>li);
boolean update(T t);
T findbyID(String id);
ArrayList<T>findAll();


}
