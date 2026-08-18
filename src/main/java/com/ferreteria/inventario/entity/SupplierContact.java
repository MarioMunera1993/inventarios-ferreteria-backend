package com.ferreteria.inventario.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class SupplierContact extends BaseEntity {

    private String name;
    private String department; //area del empledo
    private String email;
    private String phone;

    // Relación Many-to-One: Muchos contactos pertenecen a un proveedor
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id", nullable = false)
    @JsonIgnore // Evita bucles infinitos en la serialización JSON
    private Supplier supplier;
}
