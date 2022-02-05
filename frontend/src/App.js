import * as React from "react";
import { Routes, Route, Router, Outlet, Link } from "react-router-dom";

import Home from "./routes/Home";

import { ThemeProvider } from "styled-components";
import { darkTheme, lightTheme } from "./styles/theme";
import GlobalStyle from "./styles/GlobalStyle";

function App() {
  const [theme, setTheme] = React.useState(lightTheme);
  return (
    <div className="App">
      <ThemeProvider theme={theme}>
        <GlobalStyle />
        <Routes>
          <Route path="/" element={<Home />} />
        </Routes>
      </ThemeProvider>
    </div>
  );
}

export default App;
