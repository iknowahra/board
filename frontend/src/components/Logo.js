import * as React from "react";
import styled from "styled-components";

const Title = styled.span`
  background: linear-gradient(
    to right,
    #fbcac9,
    ${({ theme }) => theme.colors.lightBlue}
  );
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  ${({ theme }) => theme.title}
`;

function Logo() {
  return <Title>Awesome board</Title>;
}

export default Logo;
