package com.example.booking.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.booking.pojo.User;
import com.example.booking.vo.LoginVo;
import com.example.booking.vo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jojo
 * @since 2023-06-26
 */
public interface IUserService extends IService<User> {

    RespBean login(LoginVo loginVo);
}
