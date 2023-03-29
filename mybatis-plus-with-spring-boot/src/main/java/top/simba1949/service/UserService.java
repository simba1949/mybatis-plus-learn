package top.simba1949.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.simba1949.domain.UserEntity;
import top.simba1949.mapper.UserMapper;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author anthony
 * @date 2023/3/29
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Throwable.class)
    public int insert(UserEntity userEntity){
        this.fillData4Insert(userEntity);

        return userMapper.insert(userEntity);
    }

    @Transactional(rollbackFor = Throwable.class)
    public int update(UserEntity userEntity) {
        this.fillData4Update(userEntity);

        return userMapper.updateById(userEntity);
    }

    @Transactional(rollbackFor = Throwable.class)
    public int delete(long id) {
        return userMapper.deleteById(id);
    }

    public UserEntity get(long id) {
        return userMapper.selectById(id);
    }

    public List<UserEntity> list() {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username", "%王%");

        return userMapper.selectList(queryWrapper);
    }

    // =============================================
    // ================ private ====================
    // =============================================

    private void fillData4Insert(UserEntity userEntity){
        userEntity.setCode(UUID.randomUUID().toString());
        userEntity.setBlEnable((byte)1);
        userEntity.setBlDelete((byte)0);
        userEntity.setVersion(0L);
        userEntity.setGmtCreate(new Date());
        userEntity.setCreator("SYSTEM");
        userEntity.setCreatorId(0L);

        fillData4Update(userEntity);
    }

    private void fillData4Update(UserEntity userEntity){
        userEntity.setGmtModified(new Date());
        userEntity.setModifier("SYSTEM");
        userEntity.setModifierId(0L);
    }
}
