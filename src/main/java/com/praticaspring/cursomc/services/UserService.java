package com.praticaspring.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.praticaspring.cursomc.security.UserSS;

public class UserService {

	/** retorna o usuário atualmente logado na aplicaçao.
	 * 
	 * @return usuário logado no Spring Security
	 */
	public static UserSS authenticated() {
		try {
		return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch(Exception e) {
			return null;
		}
		
	}
}
