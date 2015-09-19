package com.laolang.junitstudy.model;

/**
 * The Class User.
 */
public class User {

	/**
	 * The Constructor.
	 */
	public User() {
		super();
	}

	/**
	 * The Constructor.
	 *
	 * @param nickname
	 *            the nickname
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 */
	public User(String nickname, String username, String password) {
		super();
		this.nickname = nickname;
		this.username = username;
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [nickname=" + nickname + ", username=" + username + ", password=" + password + "]";
	}

	/**
	 * Gets the nickname.
	 *
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * Sets the nickname.
	 *
	 * @param nickname
	 *            the nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username
	 *            the username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** The nickname. */
	private String nickname;

	/** The username. */
	private String username;

	/** The password. */
	private String password;
}
