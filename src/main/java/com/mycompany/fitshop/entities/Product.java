/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitshop.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eleni
 */
@Entity
@Table(name = "products", catalog = "fitshop", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProductId", query = "SELECT p FROM Product p WHERE p.productId = :productId")
    , @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName")
    , @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description")
    , @NamedQuery(name = "Product.findByImageUrl", query = "SELECT p FROM Product p WHERE p.imageUrl = :imageUrl")
    , @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id", nullable = false)
    private Integer productId;
    @Size(max = 50)
    @Column(name = "product_name", length = 50)
    private String productName;
    @Size(max = 150)
    @Column(length = 150)
    private String description;
    @Size(max = 200)
    @Column(name = "image_url", length = 200)
    private String imageUrl;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22, scale = 0)
    private Double price;
    @OneToMany(mappedBy = "productId", fetch = FetchType.LAZY)
    private List<Stock> stockList;
    @OneToMany(mappedBy = "productId", fetch = FetchType.LAZY)
    private List<Sales> salesList;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "brand_id") //, referencedColumnName = "brand_id")
    private Brand brand;
   
    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id") //, referencedColumnName = "category_id")
    private Category category;

    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

  

    public Product(Integer productId, String productName, String description, String imageUrl, Double price, Brand brand, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }

    public Product(String productName, String description, String imageUrl, Double price, Brand brand, Category category) {
        this.productName = productName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }
    
    
    
    

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @XmlTransient
    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    @XmlTransient
    public List<Sales> getSalesList() {
        return salesList;
    }

    public void setSalesList(List<Sales> salesList) {
        this.salesList = salesList;
    }

    public Brand getBrandId() {
        return brand;
    }

    public void setBrandId(Brand brand) {
        this.brand = brand;
    }

    public Category getCategoryId() {
        return category;
    }

    public void setCategoryId(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "com.mycompany.fitshop.entities.Product[ productId=" + productId + " ]";
//    }

//    @Override
//    public String toString() {
//        return "Product{" + "productId=" + productId + ", productName=" + productName + ", description=" + description + ", imageUrl=" + imageUrl + ", price=" + price + category + '}';
//    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", description=" + description + ", imageUrl=" + imageUrl + ", price=" + price + ", brand=" + brand + ", category=" + category + '}';
    }
    
    
    
    
    
}
