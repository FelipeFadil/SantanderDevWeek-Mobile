package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData{
    fun getLocalData() : Conta {
        val cliente = Cliente("Felipe")
        val cartao = Cartao("8080")
        return Conta ("1234567-8",
            "6554",
            "R$ 2.346,80",
            "R$ 4.120,00",
            cliente,
            cartao
        );
    }
}