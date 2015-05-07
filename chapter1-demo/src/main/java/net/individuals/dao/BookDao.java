package net.individuals.dao;

import net.individuals.model.Book;

import java.util.List;

public interface BookDao {

    public int deleteByPrimaryKey(Integer id);

    public int insert(Book record);

    public int insertSelective(Book record);

    public Book selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Book record);

    public int updateByPrimaryKey(Book record);

    public List<Book> getAll();
}