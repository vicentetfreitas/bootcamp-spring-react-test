package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;


public class AccountTests {
	//Nomeclatura de um teste - <AÇÃO> should <efeito> [when <CENÁRIO>]
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		/*
		 * Padrão AAA
		 * Arrange: instancie os objetos necessários
		 * Act: execute as ações necessárias
		 * Asset: declare o que deveria aconecer (resultado esperado)*/
		
		//ARRANNGE
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		//ACT
		acc.deposit(amount);
		
		//ASSET
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}

}
