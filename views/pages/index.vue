<template>
  <div>
    <el-container>
      
      <el-header>
        <Header></Header>
      </el-header>
      <el-main>
        <Main></Main>
      </el-main>
      
    </el-container>
  </div>
</template>

<script>
  import Header from '~/components/index/header'
  import Main from '~/components/index/main'
  export default {
    components: {
      Header,
      Main,
    }
  }
</script>

<style>
  .el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  }
</style>
