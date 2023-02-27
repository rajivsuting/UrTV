import React, { useState, useEffect } from "react"
// importing navbar styles
// import "../assets/css/navbar.css"
// import logo from "../assets/images/logo.svg"
// import logoBlue from "../assets/images/logo-blue.svg"
// responsive menu toggle icon
// import { FaAlignRight } from "react-icons/fa"
// all the navbar links coming from the links constants
// import pageLinks from "../constants/links"
// Link from gatsby
import { Link } from "react-router-dom"
const All = () => {
  //navbar scroll when active state
  const [navbar, setNavbar] = useState(false)

  //logo scroll when active
  const [navbarLogo, setNavbarLogo] = useState("red")

  //navbar scroll changeBackground function
  const changeBackground = () => {
    console.log(window.scrollY)
    if (window.scrollY >= 66) {
      setNavbar(true)
    } else {
      setNavbar(false)
    }
  }

  useEffect(() => {
    changeBackground()
    // adding the event when scroll change background
    window.addEventListener("scroll", changeBackground)
  })

  //logo scroll function
  const changeLogo = () => {
    if (window.scrollY >= 60) {
      setNavbarLogo("blue")
    } else {
      setNavbarLogo("red")
    }
  }

  useEffect(() => {
    changeLogo()
    // adding the event when scroll change Logo
    window.addEventListener("scroll", changeLogo)
  })

  return (
    <nav className={navbar ? "navbar active" : "navbar"}>
      <div className="nav-center">
        <div className="nav-header">
          <Link to="/">
            <img src={navbarLogo} alt="logo" />
          </Link>
          <button type="button" className="toggle-btn">
            {/* <FaAlignRight /> */}
          </button>
        </div>
        <div className="nav-links">
          {/* {pageLinks.map(links => {
            return (
              <Link key={links.id} to={links.url}>
                {links.text}
              </Link>
            )
          })} */}

          Haiiiiiiiiiiiii
        </div>
      </div>
    </nav>
  )
}

export default All