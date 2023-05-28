package de.kozdemir.rickyandmortyapi.entity;

import lombok.Data;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@Data
public class Info {
    private Integer count;
    private Integer pages;
    private String next;
    private String prev;
}
