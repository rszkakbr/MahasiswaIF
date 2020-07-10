package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Mahasiswa;

public interface MahasiswaService {
	List<Mahasiswa> getAllMahasiswas();
	void saveMahasiswa(Mahasiswa mahasiswa);
	Mahasiswa getMahasiswaById(long id);
	void deleteMahasiswaById(long id);
	Page<Mahasiswa> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
