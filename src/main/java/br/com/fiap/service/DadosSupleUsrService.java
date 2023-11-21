package br.com.fiap.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.fiap.dto.DadosSupleUsrDto;
import br.com.fiap.entity.DadosSupleUsr;
import br.com.fiap.repository.DadosSuplementaresUsr;

@Service
public class DadosSupleUsrService {

	private final DadosSuplementaresUsr dadosSupleUsrRepository;

	public DadosSupleUsrService(DadosSuplementaresUsr dadosSupleUsrRepository) {
		this.dadosSupleUsrRepository = dadosSupleUsrRepository;
	}

	public List<DadosSupleUsrDto> getAllDadosSupleUsr() {
		List<DadosSuplementaresUsr> dadosSupleUsrList = dadosSupleUsrRepository.findAll();
		return dadosSupleUsrList.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	public DadosSupleUsrDto getDadosSupleUsrById(Long id) {
		DadosSuplementaresUsr dadosSupleUsr = dadosSupleUsrRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("DadosSupleUsr not found for id: " + id));
		return convertToDto(dadosSupleUsr);
	}

	public DadosSupleUsrDto createDadosSupleUsr(DadosSupleUsrDto dadosSupleUsrDto) {
		DadosSupleUsr dadosSupleUsr = convertToEntity(dadosSupleUsrDto);
		DadosSupleUsr savedDadosSupleUsr = dadosSupleUsrRepository.save(dadosSupleUsr);
		return convertToDto(savedDadosSupleUsr);
	}

	public DadosSupleUsrDto updateDadosSupleUsr(Long id, DadosSupleUsrDto dadosSupleUsrDto) {
		DadosSuplementaresUsr existingDadosSupleUsr = dadosSupleUsrRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("DadosSupleUsr not found for id: " + id));

		BeanUtils.copyProperties(dadosSupleUsrDto, existingDadosSupleUsr);
		DadosSuplementaresUsr updatedDadosSupleUsr = dadosSupleUsrRepository.save(existingDadosSupleUsr);
		return convertToDto(updatedDadosSupleUsr);
	}

	public void deleteDadosSupleUsr(Long id) {
		dadosSupleUsrRepository.deleteById(id);
	}

	private DadosSupleUsrDto convertToDto(DadosSuplementaresUsr updatedDadosSupleUsr) {
		DadosSupleUsrDto dto = new DadosSupleUsrDto();
		BeanUtils.copyProperties(updatedDadosSupleUsr, dto);
		return dto;
	}

	private DadosSupleUsrDto convertToDto(DadosSupleUsr dadosSupleUsr) {
		DadosSupleUsrDto dto = new DadosSupleUsrDto();
		BeanUtils.copyProperties(dadosSupleUsr, dto);
		return dto;
	}

	private DadosSupleUsr convertToEntity(DadosSupleUsrDto dto) {
		DadosSupleUsr dadosSupleUsr = new DadosSupleUsr();
		BeanUtils.copyProperties(dto, dadosSupleUsr);
		return dadosSupleUsr;
	}

}
