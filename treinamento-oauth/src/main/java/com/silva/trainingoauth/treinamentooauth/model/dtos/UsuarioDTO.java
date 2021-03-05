package com.silva.trainingoauth.treinamentooauth.model.dtos;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO implements UserDetails, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4638409277186402316L;

	private Long id;

	private String email;

	private String senha;

	private AutorizacaoDTO dto = new AutorizacaoDTO(2L, "ADMIN");

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<AutorizacaoDTO> aut = new HashSet<AutorizacaoDTO>();
		aut.add(dto);
		return aut.stream().map(x -> new SimpleGrantedAuthority(x.getAutorizacao().toUpperCase()))
				.collect(Collectors.toList());
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return this.getSenha();
	}
}
