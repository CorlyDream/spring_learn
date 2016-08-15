package spittr.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spittr.mapper.DefaultValueMapper;

import java.util.List;

/**
 * Created by corly on 2016/8/15.
 */
@Service
public class DefaultValueServiceImpl implements DefaultValueService{

    @Autowired
    private DefaultValueMapper defaultValueMapper;

    public List getDefaultValues(int pageSize) {
        PageHelper.startPage(1,10);
        return defaultValueMapper.findByPage();
    }
}
