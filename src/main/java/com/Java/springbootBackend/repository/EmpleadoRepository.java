package com.Java.springbootBackend.repository;

import com.Java.springbootBackend.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository  extends JpaRepository<Empleado, Long> {


}

