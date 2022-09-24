package man.rason.family.tree.genealogic.repository;

import man.rason.family.tree.genealogic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
