package com.mobiquity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ParsedLine {
    private int maxWeight;
    private List<Package> packages;
}
