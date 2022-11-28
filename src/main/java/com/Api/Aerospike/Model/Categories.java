package com.Api.Aerospike.Model;

import com.aerospike.mapper.annotations.AerospikeRecord;

@AerospikeRecord
public class Categories {


    private int categoriesId;

    private String nature;


    public Categories() {
    }

    public Categories(int categoriesId) {
        this.categoriesId = categoriesId;
        this.nature = nature;
    }

    public int getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(int categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "categoriesId=" + categoriesId +
                ", nature='" + nature + '\'' +
                '}';
    }
}
