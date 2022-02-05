import * as React from "react";
import styled from "styled-components";
import Logo from "./Logo";

const Wrapper = styled.div`
  width: 100%;
  height: 7%;
  padding: 0.5rem 1.5rem;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  background-color: ${({ theme }) => theme.colors.white};
  box-shadow: 2px 1px 10px 1px rgba(0, 0, 0, 0.05);
`;

const Menus = styled.div`
  width: 65%;
  display: flex;
  flex-direction: row;
  justify-content: space-evenly;
`;

const Users = styled.div`
  width: 15%;
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
`;

const User = styled.a`
  color: ${({ theme }) => theme.colors.lightBlue};
  font-weight: ${({ theme }) => theme.fonts.weight.normal};
  margin-left: 2rem;
`;

const Titles = styled.div`
  width: 20%;
`;

const Menu = styled.a`
  font-weight: ${({ theme }) => theme.fonts.weight.bolder};
`;
function HorizonNav() {
  return (
    <Wrapper>
      <Titles>
        <Logo />
      </Titles>
      <Menus>
        <Menu>공지 게시판</Menu>
        <Menu>자유 게시판</Menu>
        <Menu>질문 게시판</Menu>
      </Menus>
      <Users>
        <User>Sign up</User>
        <User>Sign in</User>
      </Users>
    </Wrapper>
  );
}

export default HorizonNav;
