package ru.kata.spring.boot_security.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.model.Role;
import ru.kata.spring.boot_security.repositorie.RoleRepo;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepo roleRepo;

    public RoleServiceImpl(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public void save(Role role) {
        roleRepo.save(role);
    }
}
