package com.springactuator.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springactuator.api.model.CloudVendor;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    List<CloudVendor> findByVendorName(String vendorName);
}
