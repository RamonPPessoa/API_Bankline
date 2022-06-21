package com.dio.samtander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.samtander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao,Integer> {

}
