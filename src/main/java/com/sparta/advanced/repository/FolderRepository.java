package com.sparta.advanced.repository;

import com.sparta.advanced.model.Folder;
import com.sparta.advanced.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
}