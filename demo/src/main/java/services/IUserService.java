package services;

import rs.ac.singidunum.models.UserModel;

import java.util.List;

public interface IUserService {

    //da bacimo neki promenu i trazimo merge !
    List<UserModel> getAll();

    UserModel Create(UserModel model);
}
