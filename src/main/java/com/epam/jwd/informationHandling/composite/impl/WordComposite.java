package com.epam.jwd.informationHandling.composite.impl;

import com.epam.jwd.informationHandling.composite.TextComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class WordComposite implements TextComponentComposite
{
    private List<TextComponentComposite> symbols = new ArrayList<>();
    @Override
    public void addTextComponent(TextComponentComposite textComponent)
    {
        this.symbols.add(textComponent);
    }

    @Override
    public void removeTextComponent(TextComponentComposite textComponent)
    {
        this.symbols.remove(textComponent);
    }
}
