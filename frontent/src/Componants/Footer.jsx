import { Box, Image, Text } from '@chakra-ui/react'
import React from 'react'

const Footer = () => {
    return (
        <Box w={"80%"} m={"auto"} color={"white"}>
            <Box>
                <Image w={"10%"} mb={"30px"} src='./Images/Ur tv.png' />
            </Box>
            <Box display={"grid"} gridTemplateColumns={"60% 40%"} gap={"50px"}>
                <Text w={"70%"}>UR TV is a Free Movies streaming site with zero ads. We let you watch movies online without having to register or paying, with over 10000 movies.</Text>
                <Text>UR TV One does not store any files on our server, we only linked to the media which is hosted on 3rd party services.</Text>
            </Box>
            <Box textAlign={"center"} mt={"30px"}>
                <Text textAlign={"center"}>Designed and build by UR TV team, 2023 All rights reserved.</Text>
                <Box display={"flex"} justifyContent={"space-between"} alignItems={'center'} w={"15%"} m={'auto'}>
                    <Text borderBottom={"1px solid"} cursor={"pointer"}>Contact us</Text>
                    <Text borderBottom={"1px solid"} cursor={"pointer"}>Admin Panel</Text>
                </Box>
            </Box>
        </Box>
    )
}

export default Footer
