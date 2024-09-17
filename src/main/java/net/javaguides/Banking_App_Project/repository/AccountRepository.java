package net.javaguides.Banking_App_Project.repository;

import net.javaguides.Banking_App_Project.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account, Long> {
}
