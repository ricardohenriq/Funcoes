<?php
	//EXEMPLO DE BOAS PRATICAS EM "PASSAR ARGUMENTOS DE RETORNO"
	
	/**
	* 
	* Função que recebe como argumento uma variavel realmente 
	* necessária "$stringNormal" ao proposito da função, dentro 
	* da função é feita as devidas operações e ao final é retornado
	* um valor (de qualquer tipo) a quem a chamou.
	*
	*/
	function toUppercaseString($stringNormal){
		return strtoupper($stringNormal);
	}
	
	$stringNormal = 'professor: marcelo quinta';
	$stringUppercase = toUppercaseString($stringNormal);
	
	echo $stringUppercase;
?>