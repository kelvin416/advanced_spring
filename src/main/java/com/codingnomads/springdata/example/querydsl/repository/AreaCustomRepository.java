/* CodingNomads (C)2024 */
package com.codingnomads.springdata.example.querydsl.repository;

import com.codingnomads.springdata.example.querydsl.models.Area;

public interface AreaCustomRepository {
    Area findByCode(String code);
}
