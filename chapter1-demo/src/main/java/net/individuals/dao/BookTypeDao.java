package net.individuals.dao;

import net.individuals.model.Book;
import net.individuals.model.BookType;

import java.util.List;

public interface BookTypeDao {

    public int deleteByPrimaryKey(Integer id);

    public int insert(BookType record);

    public int insertSelective(BookType record);

    public BookType selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(BookType record);

    public int updateByPrimaryKey(BookType record);

    public List<BookType> getAll();

    public List<BookType> getAll2();

    public Book selectBook(Integer id);
}