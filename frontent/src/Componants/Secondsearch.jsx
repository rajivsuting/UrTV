import { Box, Button, Image, Input, Text } from '@chakra-ui/react'
import React from 'react'

const Secondsearch = () => {
  return (
    <Box>
      <Image w={"90%"} h={"700px"} m={"auto"} mt={"100px"}  src='/Images/bg movie.jpg' />
      <Box position={"absolute"} top={"5%"} left={"20%"} color={"white"}>
        <Text fontSize={"50px"} fontWeight={'bold'}>Unlimited movies, TV shows and more.</Text>
        <Text fontSize={"18px"} textAlign={"center"} mt={"10px"}>Watch anywhere, you want.</Text>
        <Box display={"flex"} justifyContent={'space-between'} alignItems={'center'} m={'auto'} mt={"30px"} w={"70%"}>
            <Input w={"75%"} type={"text"} placeholder={"What you want to see ......."} variant={"unstyled"} border={'1px solid'} p={"7px"} _hover={{borderBottom:"3px solid"}}/>
            <Button border={"1px solid"} p={"7px"} pl={"10px"} pr={"10px"} variant={"unstyled"} _hover={{borderBottom:"3px solid"}}>Search your movie</Button>
        </Box>
      </Box>
    </Box>
  )
}

export default Secondsearch
