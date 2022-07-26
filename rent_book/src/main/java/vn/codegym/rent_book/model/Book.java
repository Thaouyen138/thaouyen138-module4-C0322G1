package vn.codegym.rent_book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name = "book")
public class Book {

    @Id
    private Integer id;

    @Column(name = "name_book")
    private String nameBook;

    @Column(name = "type_book")
    private String typeBook;

    private String author;
    private String quantity;

    @OneToMany(mappedBy = "book")
    private Set<RentBook> rentBooks;

    public Book(Integer id, String nameBook, String typeBook, String author, String quantity, Set<RentBook> rentBooks) {
        this.id = id;
        this.nameBook = nameBook;
        this.typeBook = typeBook;
        this.author = author;
        this.quantity = quantity;
        this.rentBooks = rentBooks;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Set<RentBook> getRentBooks() {
        return rentBooks;
    }

    public void setRentBooks(Set<RentBook> rentBooks) {
        this.rentBooks = rentBooks;
    }
}
