package ru.kata.spring.boot_security.repositorie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.model.Role;

@Repository
public interface RoleRepo extends CrudRepository<Role, String> {
}
