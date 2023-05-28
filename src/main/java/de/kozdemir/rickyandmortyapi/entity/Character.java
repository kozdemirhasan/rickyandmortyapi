package de.kozdemir.rickyandmortyapi.entity;

import lombok.Data;

import java.util.List;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@Data
public class Character {
    private Info info;
    private List<Result> results;

}
