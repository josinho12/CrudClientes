package com.josue.crudclientes.repository;

import com.josue.crudclientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aqui você pode criar métodos personalizados depois, se quiser
}