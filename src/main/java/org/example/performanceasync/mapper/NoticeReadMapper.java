package org.example.performanceasync.mapper;

import org.example.performanceasync.dto.Notice;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface NoticeReadMapper {
    public List<Notice> findAll();
}
