package com.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.dto.WriterDTO;
import com.example.entity.Writer;

@Mapper(componentModel = "spring" )
public interface WriterMapper {

//	@Mapping(source = "CId", target = "language.id")
	public Writer toWriter(WriterDTO writerDTO);

//	@Mapping(source = "id", target = "WId")
//	@Mapping(source = "LId", target = "language.id")
	public WriterDTO toWriterDTO(Writer writer);
}
