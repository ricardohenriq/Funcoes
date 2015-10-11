<?php
	//EXEMPLO DE MÁS PRATICAS EM "PASSAR ARGUMENTOS DE RETORNO"
	
	/**
	* 
	* Função que recebe como argumento uma variavel realmente 
	* necessária "$stringNormal" ao proposito da função e uma variavel 
	* stringUppercase" (neste caso um endereço) que terá seu valor 
	* modificado dentro da função e posteriormente acessada no resto do 
	* código já com valor modificado.
	*
	*/
	function toUppercaseString($stringNormal, &$stringUppercase){
		$stringUppercase = strtoupper($stringNormal);
	}
	
	$stringNormal = 'professor: marcelo quinta';
	$stringUppercase = '';
	
	toUppercaseString($stringNormal, $stringUppercase);
	
	echo $stringUppercase;
?>