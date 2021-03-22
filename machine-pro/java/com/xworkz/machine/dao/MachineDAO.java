package com.xworkz.machine.dao;

import java.util.List;

import com.xworkz.machine.entity.MachineEntity;

public interface MachineDAO {

	public void save(MachineEntity entity);

	public MachineEntity findByName(String name);

	public List<MachineEntity> getAll();

	public void deleteById(int id);
}
