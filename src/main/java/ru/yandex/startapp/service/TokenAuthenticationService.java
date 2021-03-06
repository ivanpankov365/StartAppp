package ru.yandex.startapp.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface TokenAuthenticationService {

	Authentication getAuthentication(HttpServletRequest request);
}
