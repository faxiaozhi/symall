package com.yima.symall.wms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yima.core.bean.PageVo;
import com.yima.core.bean.QueryCondition;
import com.yima.core.bean.Resp;
import com.yima.symall.wms.entity.WareSkuEntity;
import com.yima.symall.wms.service.WareSkuService;
import com.yima.symall.wms.vo.SkuLockVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


/**
 * 商品库存
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-04-09 17:59:50
 */
@Api(tags = "商品库存 管理")
@RestController
@RequestMapping("wms/waresku")
public class WareSkuController {
    @Autowired
    private WareSkuService wareSkuService;

    @PostMapping
    public Resp<Object> checkAndLockStore(@RequestBody List<SkuLockVO> skuLockVOS){

        String msg = this.wareSkuService.checkAndLockStore(skuLockVOS);
        if (StringUtils.isEmpty(msg)) {
            return Resp.ok(null);
        }
        return Resp.fail(msg);
    }

    @GetMapping("{skuId}")
    public Resp<List<WareSkuEntity>> queryWareSkusBySkuId(@PathVariable("skuId")Long skuId){

        List<WareSkuEntity> wareSkuEntities = wareSkuService.list(new QueryWrapper<WareSkuEntity>().eq("sku_id", skuId));
        return Resp.ok(wareSkuEntities);
    }
    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('wms:waresku:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = wareSkuService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('wms:waresku:info')")
    public Resp<WareSkuEntity> info(@PathVariable("id") Long id){
		WareSkuEntity wareSku = wareSkuService.getById(id);

        return Resp.ok(wareSku);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('wms:waresku:save')")
    public Resp<Object> save(@RequestBody WareSkuEntity wareSku){
		wareSkuService.save(wareSku);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('wms:waresku:update')")
    public Resp<Object> update(@RequestBody WareSkuEntity wareSku){
		wareSkuService.updateById(wareSku);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('wms:waresku:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		wareSkuService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
