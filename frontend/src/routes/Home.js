import * as React from "react";
import Nav from "../components/Nav";

import styled from "styled-components";
import PropTypes from "prop-types";

const Wrapper = styled.div`
  width: 100vw;
  height: 100vh;
  overflow-x: hidden;
  overflow-y: auto;
  border: 1px solid black;
`;

function Home() {
  return (
    <Wrapper>
      <Nav />
    </Wrapper>
  );
}

export default Home;
