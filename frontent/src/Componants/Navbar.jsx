import React, { useState } from 'react'
import {  Box, Button, Divider, Flex, Image, Text, Menu,
  MenuButton,
  MenuList,
  MenuItem, } from '@chakra-ui/react'
import { BsChevronDown } from "react-icons/bs";
import {CgProfile} from "react-icons/cg"
import {SiGnuprivacyguard} from "react-icons/si";
import {AiOutlineLogin} from "react-icons/ai";
import {AiOutlinePoweroff} from "react-icons/ai"

const Navbar = () => {

  return (
    <Box p={"20px"} position={"fixed"} top={"0"} zIndex={"9"}  color={"white"} display={"flex"} justifyContent={'space-between'} alignItems={'center'} w={'100%'} margin={'auto'} pl={"50px"} pr={"50px"} mb={"50px"} bgColor={"black"}>
      <Box>
        <Image src='./Images/Ur tv.png' w={"30%"}/>
      </Box>
      <Box display={"flex"} justifyContent={"space-between"} w={"30%"} alignItems={'center'}>
        <Text>All movies</Text>
        <Text>Categories</Text>
        <Menu>
          <MenuButton variant={"unstyled"} as={Button} rightIcon={<BsChevronDown fontSize={"10px"} fontWeight={"semibold"}/>}>
            Join with us
          </MenuButton>
          <MenuList color={"white"} bgColor={"black"} textAlign={'center'}>
            <MenuItem color={"white"} bgColor={"black"} display={"flex"} justifyContent={"center"} alignItems={"center"} margin={'auto'} gap={"10px"}><CgProfile />My profile</MenuItem>
            <MenuItem color={"white"} bgColor={"black"} display={"flex"} justifyContent={"center"} alignItems={"center"} margin={'auto'}><SiGnuprivacyguard />Register</MenuItem>
            <MenuItem color={"white"} bgColor={"black"} textAlign={'center'} display={"flex"} justifyContent={"center"} alignItems={"center"} margin={'auto'}><AiOutlineLogin />Login</MenuItem>
            <MenuItem color={"white"} bgColor={"black"} textAlign={'center'} display={"flex"} justifyContent={"center"} alignItems={"center"} margin={'auto'}><AiOutlinePoweroff />Log out</MenuItem>
          </MenuList>
        </Menu>
      </Box>
    </Box>
  )
}

export default Navbar
