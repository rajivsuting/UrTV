import { Box, Image } from '@chakra-ui/react'
import React from 'react';
import "react-responsive-carousel/lib/styles/carousel.min.css"; // requires a loader
import { Carousel } from 'react-responsive-carousel';

const ThirdCrousel = () => {
  return (
    <Box m={"auto"} width={"50%"} borderRadius={"10px"}>
      <Carousel infiniteLoop autoPlay>
            <Box className='Image' borderRadius={"10px"}>
                <Image borderRadius={"10px"} src='./Images/modhyobitto.jpeg' />
            </Box>
            <Box className='Image' borderRadius={"10px"}>
                <Image borderRadius={"10px"} src='./Images/RRR.webp' />
            </Box>
            <Box className='Image' borderRadius={"10px"}>
                <Image borderRadius={"10px"} src='./Images/The warrior.webp' />
            </Box>
            <Box className='Image' borderRadius={"10px"}>
                <Image borderRadius={"10px"} src='./Images/varisu.webp' />
            </Box>
            {/* <Box className='Image'>
                <Image src='https://user-images.githubusercontent.com/103739534/212999424-92345e3d-a9ff-42f9-a946-c692113636f2.png' />
            </Box>
            <Box className='Image'>
                <Image src='https://user-images.githubusercontent.com/103739534/212999437-c1ae5f85-0d0a-43cd-840f-acae27da9d88.png' />
            </Box>
            <Box className='Image'>
                <Image src='https://user-images.githubusercontent.com/103739534/212999363-172d3d05-fe2e-4dd9-96e9-74fc3be56a48.png' />
            </Box> */}
        </Carousel>
    </Box>
  )
}

export default ThirdCrousel
