package com.asdf.ho.entity;


import com.asdf.ho.dto.board.BoardResponseDto;
import com.asdf.ho.dto.category.CategoryDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String categoryname;

    public Category(String categoryname) {
        this.categoryname = categoryname;
    }



    public CategoryDto toDto(List<BoardResponseDto> boards) {
        return CategoryDto.builder()
                .categoryname(categoryname)
                .boards(boards)
                .build();
    }


}
